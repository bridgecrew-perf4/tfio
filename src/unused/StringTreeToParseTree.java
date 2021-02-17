package unused;

public class StringTreeToParseTree {
	
	/*
	 * private JsonArray buildParseTree(String string) {
		
		// remove the "expression" rule
		string = string.substring(string.indexOf(" ")+1, string.length()-1);
		
		// we're gonna parse this baby manually
		// because regex doesn't allow overlapping group intervals on matcher? ...
		
		// read from here
		char[] sequence = string.toCharArray();
		// insert into here
		StringBuilder appender = new StringBuilder();
		
		// our rules are:
		// 1. all tokens must be surrounded by quotes
		// 2. all '(' that aren't tokens --> '['
		// 3. all ')' that aren't tokens --> ']'
		// 4. all ' ' --> ','
		
		// this is all one big array
		appender.append('[');
		
		// now we continue to append based on what we read
		int i = 0;
		
		// we also need to track whether we're inside a string...
		Boolean inString = false;
		
		while (i < sequence.length) {
			
			// case 1 : '(' followed by space --> '(' token
			// case 2 : '(' followed by non-space --> '(' rule
			if (sequence[i] == '(') {
				if (sequence[i+1] == ' ') {
					// this '(' is a token!
					appender.append("\"(\",");
					i += 2;
				} else {
					// this '(' might be the start of a normal text token
					if (inString) {
						int search = i;
						StringBuilder builder = new StringBuilder();
						while (sequence[search] != ' ') {
							builder.append(sequence[search]);
							search++;
						}
						String possibleRule = builder.toString();
						// we have high confidence that this is the start of a rule
						// but there's no guarantee.. I'm so pissed.
						if ( ! ruleMap.containsKey(possibleRule)) {
							// this is just a text token...
							while (sequence[i] != ' ') {
								appender.append(sequence[i++]);
							}
							appender.append(",");
							i +=2 ;
						}
					}
					appender.append("[\"");
					i++;
					while (sequence[i] != ' ') {
						appender.append(sequence[i++]);
					}
					appender.append("\",");
					i++;
				}
			}
			// case 3 : ')' EOF --> ']'
			// case 4 : ')' preceded by a space --> rparenToken (followed by a space, ',')
			// case 5 : ')' folowed by non-space --> rparenClose
			else if (sequence[i] == ')') {
				if (i == sequence.length - 1) {
					// this ')' is the EOF
					appender.append(']');
					i++;
				} else if (sequence[i-1] == ' ') {
					// this ')' is a token!
					appender.append("\")\"");
					i++;
					
					// does it have a continuation?
					if (sequence[i] == ' ') {
						appender.append(",");
						i++;
					}
				} else if (sequence[i+1] == ' ') {
					appender.append("],");
					i += 2;
				} else {
					appender.append(']');
					i++;
				}
			} 
			// case 6 : not '(' or ')' and ends with ')'
			// case 7 : not '(' or ')' and ends with ' '
			else {
				// this may end in a ' ' (token) or ')' (end of rule)
				appender.append("\"");
				while (sequence[i] != ')' && sequence[i] != ' ') {
					// write characters, escape dquotes
					if (sequence[i] == '"') {
						inString = !inString;
						appender.append("\\\"");
						i++;
					} else {
						appender.append(sequence[i++]);
					}
				}
				// close quote
				appender.append("\"");
				
				// close end rule (']') or continue? (',')
				if (sequence[i] == ')') {
					appender.append("]");
					i++;
					if (i < sequence.length && sequence[i] == ' ') {
						appender.append(",");
						i++;
					}
				} else {
					appender.append(",");
					i++;
				}
			}
		}
		appender.append(']');
		
		if (counter == 1) {
			System.out.println();
		}
		if (appender.toString().contentEquals("[[\"exprTerm\",[\"reference\",[\"identifier\",\"var\"]]],[\"accessor\",[\"attr\",\".\",[\"identifier\",\"identifier\"]]]]")) {
			counter = 1;
		}
		
		char[] modifiedSequence = appender.toString().toCharArray();
		CharArrayReader charArrayReader = new CharArrayReader(modifiedSequence);
		JsonReader reader = Json.createReader(charArrayReader);
		
		return reader.readArray();
	}

	/*
	private JsonArray buildParseTree(String string) {
		
		// 1. remove the first expression rule.
		//  . every expression evaluates as an expression. no information gained.
		
		string = string.substring(string.indexOf(" ")+1, string.length()-1);
		
		// 2. surround tokens with dquotes, for json parser
		//  . find positions of dquotes, insert, repeat
		
		// initialize the linked list of chars
		// linked lists don't require a "copy-on-insert"
		// and we're gonna do *  a  lot  * of inserting
		LinkedList<Character> linkedList = new LinkedList<Character>();
		for (char c : string.toCharArray()) {
			linkedList.add(c);
		}
		
		// initalize the token finders
		Pattern lparen = Pattern.compile("\\(\\S+");     // leftPos = +1, rightPos =  0
		Pattern rparen = Pattern.compile("[^\\) ]+\\)"); // leftPos =  0, rightPos = -1
		
		// execute patterns 
		int numInsertsSoFar = 0;
		numInsertsSoFar = insertDquotes(string, linkedList, lparen, 1,  0, numInsertsSoFar);
		numInsertsSoFar = insertDquotes(string, linkedList, rparen, 0, -1, numInsertsSoFar);
		
		insertDquotesCenter(string, linkedList, numInsertsSoFar);
		
		// 3. 
		//  . That was the hard part
		//  . Now, we just need to do non-insertion replacements:
		
		//  '(' -> '[' if not preceded by '"'
		//  ')' -> ']' if not preceded by '"'
		//  ' ' -> ','
		
		// we'll get back to a char[] sequence while we're at it
		char[] sequence = new char[linkedList.size()];
		Iterator<Character> iter = linkedList.iterator();
		
		// saves us an out of bounds check on the first parens:
		sequence[0] = iter.next();
		
		for (int i = 1; i < sequence.length; i++) {
			char c = iter.next();
			if (c == '(' && sequence[i-1] != '"') {
				sequence[i] = '[';
			} else if (c == ')' && sequence[i-1] != '"') {
				sequence[i] = ']';
			} else if (c == ' ') {
				sequence[i] = ',';
			} else {
				sequence[i] = c;
			}
		}
		
		// finally, I hope all this worked.
		// we will have translated:
		// lisp list w/ sublists --> json array w/ subarrays
		// lol
		
		CharArrayReader charArrayReader = new CharArrayReader(sequence);
		JsonReader reader = Json.createReader(charArrayReader);
		return reader.readArray();
	}
	*/
	
	/*
	private void insertDquotesCenter(String string, LinkedList<Character> linkedList, int numInsertsSoFar) {
		
		char[] sequence = string.toCharArray();
	
		// we're looking for the pattern ' ', 1 or more chars, ' '
		// the last space is allowed to overlap with the first space of the next pattern
		// regex matcher doesn't handle that situation, so here we are:
		
		// match on these       : " asd ) (
		// don't match on these : (asd asda) (( ))
		
		// all strings start and end with spaces
		
		int start = 0;
		int stop = 0;
		
		String test
		for (int i = 0; i < sequence.length; i++) {
			
			char curr = sequence[i];
			
			if (curr == ' ') {
				start = i + 1;
				while (sequence[i] != ' ') {
					i++;
				}
				test = string.substring(start, i);
				if (test.startsWith("")) 
			}
			
			
		}
	}
	
	// i should be index of lparen
	private int replaceLParenQuote(StringBuilder appender, char[] sequence, int i) {
		
		appender.append("[\"");
		i++;
		while (sequence[i] != ' ') {
			appender.append(sequence[i++]);
		}
		appender.append("\",");
		return i + 1;
	}
	
	// i should be index of first token of string which ends with ')'
	private int replaceRParenQuote(StringBuilder appender, char[] sequence, int i) {
		
		while (sequence[i] != ')') {
			appender.append(sequence[i++]);
		}
		appender.append("\"]");
		i++;
		
		return i + 1;
	}

	private int insertDquotes(
			String string, LinkedList<Character> list, Pattern pattern, 
			int shiftL, int shiftR, int numInsertsSoFar) {
		
		int insertPosL = 0;
		int insertPosR = 0;
		Matcher matcher = pattern.matcher(string);
		
		String match = "";
		
		while (matcher.find()) {
			
			match = matcher.group();
			
			insertPosL = shiftL + matcher.start() + numInsertsSoFar++;
			insertPosR = shiftR + matcher.end()   + numInsertsSoFar++;
			
			list.add(insertPosL, '"');
			list.add(insertPosR, '"');
		}
		
		return numInsertsSoFar;
	}
	*/
}
