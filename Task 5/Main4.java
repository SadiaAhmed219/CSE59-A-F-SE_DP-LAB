interface OptimizableModel {
    void quantize();
}
class ResNet18 implements OptimizableModel {
    public void quantize() {
        System.out.println("Applying Int8 Quantization for Resnet18");
    }
}
class MobileNet implements OptimizableModel {

    public void quantize() {
        System.out.println("Applying Dynamic Quantization for MobileNet");
    }

}
class InterfaceEngine {
    public void optimize(OptimizableModel Model) {
        model.quantize();
    }
}
public class Main4 {

    public static void main(String[] args) {

        InferenceEngine engine = new InferenceEngine();

        engine.optimize(new ResNet18());
        engine.optimize(new MobileNet());
    }
}
