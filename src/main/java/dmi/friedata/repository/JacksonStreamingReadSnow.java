package dmi.friedata.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import dmi.friedata.model.SneMaaling;
import dmi.friedata.model.SnowMeasurement;

public class JacksonStreamingReadSnow {
	
	public static void read(List<SneMaaling> sneMaalinger) throws JsonParseException, IOException {
		
		//create JsonParser object 
		JsonParser jsonParser = new JsonFactory().createParser(new File("//home//carsten//projects//data//snemaaling.json"));
		
		//loop through the tokens
		SnowMeasurement snow = new SnowMeasurement();
		
		while (jsonParser.nextToken() != JsonToken.END_ARRAY)
		{			
			parseJSON(jsonParser, snow);
			System.out.println("Snow Object\n\n"+snow);
			
			SneMaaling sne = new SneMaaling();
			
			sne.setBest(snow.isBest());
			sne.setInsid(Integer.parseInt(snow.getInsid()));
			sne.setSnow_cover_man(snow.getSnow_cover_man());
			sne.setSnow_cover_man_qc1(snow.getSnow_cover_man_qc1());
			sne.setSnow_depth_man(snow.getSnow_cover_man());
			sne.setSnow_depth_man_qc1(snow.getSnow_depth_man_qc1());
			sne.setStatid(Long.parseLong(snow.getStatid()));
			sne.setTimeobs(snow.getTimeobs());
			sneMaalinger.add(sne);
			
		}		
		jsonParser.close();
	}
	
	private static void parseJSON(JsonParser jsonParser, SnowMeasurement snow) throws JsonParseException, IOException {
		
//		private String insid;		
//		private String statid;		
//		private String timeobs;		
//		private boolean best;		
//		private double snow_depth_man;		
//		private int snow_depth_man_qc1;		
//		private double snow_cover_man;		
//		private int snow_cover_man_qc1;
				
		//loop through the JsonTokens
		while(jsonParser.nextToken() != JsonToken.END_OBJECT){
			String name = jsonParser.getCurrentName();			
			if("insid".equals(name)){
				jsonParser.nextToken();
				snow.setInsid(jsonParser.getText());
			} else if ("statid".equals(name)){
				jsonParser.nextToken();
				snow.setStatid(jsonParser.getText());
			} else if ("timeobs".equals(name)){
				jsonParser.nextToken();
				snow.setTimeobs(jsonParser.getText());
			} else if ("best".equals(name)){
				jsonParser.nextToken();
				snow.setBest(jsonParser.getBooleanValue());
			} else if ("snow_depth_man".equals(name)){
				jsonParser.nextToken();
				snow.setSnow_depth_man(jsonParser.getValueAsDouble());
			} else if ("snow_depth_man_qc1".equals(name)){
				jsonParser.nextToken();
				snow.setSnow_depth_man_qc1(jsonParser.getIntValue());
			} else if ("snow_cover_man".equals(name)){
				jsonParser.nextToken();
				snow.setSnow_cover_man(jsonParser.getValueAsDouble());
			} else if ("snow_cover_man_qc1".equals(name)){
				jsonParser.nextToken();
				snow.setSnow_cover_man_qc1(jsonParser.getIntValue());
			} 
		}
	}

}

