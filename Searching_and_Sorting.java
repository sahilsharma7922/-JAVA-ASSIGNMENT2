import java.io.*;
import java.util.Scanner;
public class Searching_and_Sorting  {
// bubble sort
public void sorting(String s[],int length)
{
	int i,j;
	for(i=0;i<length;i++)
	{
		for(j=0;j<length-i-1;j++)
		{
			if(s[j].compareTo(s[j+1])>=1)
			{
			String ki=s[j];
			s[j]=s[j+1];
			s[j+1]=ki;
			}
		}			
        }
}
public static void main(String[] arg) throws Exception
	{
        // file in which data to be written
        FileWriter fw=new FileWriter("C:\\users\\Sahil Sharma\\Desktop\\HW2.txt");
        File ke=new File("C:\\Users\\Sahil Sharma\\Desktop\\java\\HW2-keywords.txt");
        File di=new File("C:\\Users\\Sahil Sharma\\Desktop\\java\\HW2-Dictionary.txt");
        // reading dictionary file
        Scanner key=new Scanner(ke);
        // reading keyword file
        Scanner dic=new Scanner(di);
        String keyw[]=new String[84];
	String dict[]=new String[16000];
	int i=0,j=0;
	// reading the keyword file and storing each line in string array
	while(key.hasNextLine())
	{
		    keyw[i]=key.nextLine();
	        i++;
	}
	Searching_and_Sorting ar=new Searching_and_Sorting();
	// calling the sorting function
	ar.sorting(keyw,keyw.length);
	// reading the dictionary file and storing each line in string array
	while(dic.hasNextLine())
	{
			dict[j]=dic.nextLine();
			j++;		
	}
	// calling the sorting function
	ar.sorting(dict,dict.length);
	int c=0;	
	// searching the keyword array in dictionary array
	for(i=0;i<84;i++)
	{
	        int f=0;
			for(j=0;j<16000;j++)
			{
				if(keyw[i].equals(dict[j]))
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				fw.write("Keyword not found:"+keyw[i]+"\r\n");
				c++;
			}
				
	}
	fw.write("Number of Keywords not found="+c);
	dic.close();
	key.close();
	fw.close();
	}
}
