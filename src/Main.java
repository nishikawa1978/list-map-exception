import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 関東地方の都道府県リスト作成
        List<String> prefectures = List.of(
                "tokyo",
                "chiba",
                "kanagawa",
                "saitama",
                "ibaraki",
                "tochigi",
                "gumma"
        );

        System.out.println("リストの内容を出力");
        prefectures.forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println("リストの内容を大文字に変更、アルファベット順に並び変えて出力");
        prefectures.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println("iが含まれるリストの内容を出力");
        List<String> result = prefectures.stream().filter(n -> n.contains("i")).toList();
        result.forEach(System.out::println);


        // 関東の県庁所在地のマップ作成
        Map<String, String> prefecturalCapital = Map.of(
                "tokyo", "shinjuku",
                "chiba", "chiba",
                "kanagawa", "yokohama",
                "saitama", "saitama",
                "ibaraki", "mito",
                "tochigi", "utsunomiya",
                "gumma", "maebashi"
        );

        System.out.println("--------------------------------");
        System.out.println("マップの内容を出力");
        prefecturalCapital.forEach((k,v) -> System.out.println(k + " : " + v));

        // キーを抽出
        System.out.println("--------------------------------");
        System.out.println("キーをソートして抽出");
        prefecturalCapital.keySet().stream().sorted().forEach(System.out::println);

        // 例外を発生させる
        System.out.println("--------------------------------");
        System.out.println("例外を発生させる");

        // ArrayIndexOutOfBoundsException
        try{
            System.out.println(prefectures.get(7));
        } catch (Exception e){
            e.printStackTrace();
        }

        // NullPointerException
        try{
            String hokkaido  =prefecturalCapital.get("hokkaido");
            System.out.println(hokkaido.toUpperCase());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
