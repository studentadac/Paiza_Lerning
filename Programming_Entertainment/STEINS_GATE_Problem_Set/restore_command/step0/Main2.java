//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/restore_command_step0
//コメント：ChatGPTに高速化させたもの ６件のテストの合計実行時間 0.32秒  直前に投稿した自作は0.51秒
//コード：
//```Java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        int result = -a + b;
        bw.write(String.valueOf(result));
        bw.newLine();

        // バッファに残っているデータを書き出す
        bw.flush();

        // リソースを解放する
        br.close();
        bw.close();
    }
}
//```