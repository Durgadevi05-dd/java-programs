import java.util.LinkedHashMap;

public class WordFrequencytask
{
    public static void main(String[] args)
    {
        String sentence = "java is easy java is powerful java";

        String[] words = sentence.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String word : words)
        {
            if(map.containsKey(word))
            {
                map.put(word, map.get(word) + 1);
            }
            else
            {
                map.put(word, 1);
            }
        }

        for(String word : map.keySet())
        {
            System.out.println(word + " -> " + map.get(word));
        }
    }
}