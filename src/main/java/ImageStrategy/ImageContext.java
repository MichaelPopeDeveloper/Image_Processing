package ImageStrategy;

public class ImageContext {
    private IImageStrategy strategy;

    public ImageContext(IImageStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void executeStrategy()
    {
        strategy.doOperation();
    }
}
