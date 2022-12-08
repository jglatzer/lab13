import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lab13 
{
	ArrayList<Integer> list = new ArrayList<>();
	public void readData(String filename)
	{
		
		try
		{
	        java.io.BufferedReader input = new java.io.BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	        String inn;
	        while (((inn = input.readLine()) != null)) 
	        {
	        	
	        	list.add(Integer.parseInt(inn.trim()));
	        	
	        }
		}
		catch(Exception e)
		{
			
		}
	}
	
	public long getTotalCount()
	{
		return list.stream().count();
	}
	
	public long getOddCount()
	{
		return list.stream().filter(x ->  x % 2 == 1).count();
	}
	
	public long getEvenCount()
	{
		return list.stream().filter(x -> x % 2 == 0).count();
	}
	
	public long getDistinctGreaterThanFiveCount()
	{
		return list.stream().distinct().filter(x -> x > 5).count();
	}
	
	public Integer[] getResult1()
	{
		return list.stream().filter(x -> x % 2 == 0 && x > 5 && x < 50).sorted().toArray(Integer[]::new);
	}
	
	public Integer[] getResult2()
	{
		return list.stream().map(x -> (x*x) * 3).limit(50).toArray(Integer[]::new);

	}
	
	public Integer[] getResult3()
	{
		return list.stream().filter(x -> x % 2 == 1).map(x -> x * 2).sorted().skip(20).distinct().toArray(Integer[]::new);

	}
	
	
}
