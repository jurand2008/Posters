import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reader {

    BufferedReader buf;
    StringTokenizer st;

    Reader(){
        buf = new BufferedReader(new InputStreamReader(System.in));
    }

    int nextInt(){
        return Integer.parseInt(next());
    }
    String next(){
        while(st == null || !st.hasMoreElements()){
            try {
                st = new StringTokenizer(buf.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
}
