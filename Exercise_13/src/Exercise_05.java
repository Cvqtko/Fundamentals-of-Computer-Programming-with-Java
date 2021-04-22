/* 5. Напишете програма, която приема URL адрес във формат:
[protocol]://[server]/[resource]
и извлича от него протокол, сървър и ресурс. Например, при подаден адрес: http://www.devbg.org/forum/index.php резултатът е:
[protocol]="http"
[server]="www.devbg.org"
[resource]="/forum/index.php"*/
public class Exercise_05 {

	public static void main(String[] args) {
		String url = "http://www.devbg.org/forum/index.php";

		String protocol = url.substring(0, url.indexOf(":"));
		String server = url.substring(url.indexOf("//") + 2, +url.indexOf("/", url.indexOf("//") + 2));
		String resource = url.substring(url.indexOf(server) + server.length());

		System.out.println("[protocol] = \"" + protocol + "\"");
		System.out.println("[server] = \"" + server + "\"");
		System.out.println("[resource] = \"" + resource + "\"");
	}
}
