public class Weighted_Word_Mapping 
{
public static void main(String[] args)
{
String[] words = {"a","b","c"};
int[] weights={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
StringBuilder sb = new StringBuilder();

for(int i=0; i<words.length; i++)
{
String s = words[i];
int sum=0;
for(int j=0; j<s.length(); j++)
{
int idx=(s.charAt(j))-'a';
 sum=sum+weights[idx];
}
int mod=sum%26;
sb.append((char)(122-mod));
}
System.out.println(sb.toString());
}
}