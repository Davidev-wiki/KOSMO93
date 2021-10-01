package a.b.c.com.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFile {

	public static final String JSON_FILE_NAME = "JsonTest2";
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject pInfo = new JSONObject();
		
		pInfo.put("name", "David");
		pInfo.put("age", "34");
		pInfo.put("jobInfo", "coder");
		
		JSONArray hobbyList = new JSONArray();
		hobbyList.add("programming");
		hobbyList.add("sleeping");
		hobbyList.add("studying");
		
		pInfo.put("message", hobbyList);
		
		try{
			
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(CommonJSON.JSON_FILE_PATH+"/"+JSON_FILE_NAME+".json"));
			bw.write(pInfo.toJSONString());
			// 잔여 Buffer를 없애는 작업.
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			System.out.println("error !! : " + e.getMessage());
		}
		System.out.println("pInfo : " + pInfo);
	}

}
