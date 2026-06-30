interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}
interface ContainerOps {
    void restartDockerContainer();

}

class WebController implements HttpService {
    public void handleHttpRequest(){
        System.out.println("Handing HTTP Request");
    }
}
public class Main6 {

    public static void main(String[] args) {

        WebController controller = new WebController();
        controller.handleHttpRequest();
    }
}
