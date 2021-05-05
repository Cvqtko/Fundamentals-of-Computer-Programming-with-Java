
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
