import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			processdata();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void processdata() throws IOException
	{
		final String INPUT = "C:\\Users\\shra1116\\Desktop\\Test Data\\input.text";
		final String OUTPUT = "C:\\Users\\shra1116\\Desktop\\Test Data\\output.text";
		BufferedReader br = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		HashMap<String, List<String>> map=new HashMap();
		try {
			fr=new FileReader(INPUT);
			br=new BufferedReader(fr);
			
			fw=new FileWriter(OUTPUT,true);
			bw=new BufferedWriter(fw);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String[] serverData=sCurrentLine.split(",");
				
				String serverName=serverData[1]+serverData[2];
				String serverVersion=serverData[3];
				List<String> serverVersionList=map.get(serverName);
				if(serverVersionList==null){
					serverVersionList=new ArrayList<String>();
				}
				serverVersionList.add(serverVersion);
				Collections.sort(serverVersionList);
				map.put(serverName, serverVersionList);	
			}
			
			int count=getCount(map);
			System.out.println(count);
			bw.write(""+count);
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			fr.close();
			br.close();
			fw.close();
			bw.close();
		}
		
	}

	private static int getCount(HashMap<String, List<String>> map) {
	    int temp=0;
	    Set<String> keys=map.keySet();
	    for(String key: keys)
	    {
	    	List<String> current=map.get(key);
	    	boolean istocount=isToCount(current);
	    	if(istocount)
	    	{
	    		temp++;
	    	}
	    	
	    }
		return temp;
	}

	private static boolean isToCount(List<String> current) {
		
			for(int i=current.size()-1;i>1;i--)
			{
				if(!current.get(i).equals(current.get(i-1)))
						{
					        return true;
						}
			}	
		return false;
	}
}

