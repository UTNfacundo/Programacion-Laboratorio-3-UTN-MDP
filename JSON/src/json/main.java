package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class main {

	public static void main(String[] args) 
	{
		try
		{
		
			JSONArray arreglo = new JSONArray();
			
			for (int i = 0; i<5;i++)
			{
				JSONObject objeto = new JSONObject();
				objeto.put("pos", "POS"+i);
				objeto.put("valor", i+1);				
				//System.out.println(objeto.toString());
				arreglo.put(objeto);
			}
			
			for (int i = 0; i<arreglo.length();i++)
			{
				JSONObject jsonObject = arreglo.getJSONObject(i);
				System.out.println(jsonObject.toString());
				System.out.println(jsonObject.getInt("valor"));
			}
			
			
			//System.out.println(arreglo.toString());
			
			//JsonUtiles.grabar(arreglo);
			JsonUtiles.leer();
			
			
			
		}
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	
	}

}
