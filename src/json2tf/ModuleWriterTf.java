package json2tf;

import java.io.OutputStream;
import javax.json.*;

public class ModuleWriterTf {
	
	private JsonObject module;
	
	public ModuleWriterTf(JsonObject module) {
		this.module = module;
	}
	
	// We can make the following assumptions:
	// 1. The first layer of JsonObjects are modules. 
	//  . There will be at least 1 module, the root module.
	//  . The root module can be identified as the only module specifying an absolute path.
	//  . It is also the first module in the map
	//  . but I'm not sure if the file's ordering holds after conversion to an in-memory "JsonObject".
	// 2. Within each module will be the following objects:
	//  . 
	
	//  . We can identify the root module because it will have the least number of 
	// 1. There will be one map object per top-level block type.
	//  . "terraform", "providers", "resources", "datas", "
	public void printTf(OutputStream stream) {
		
	}

}
