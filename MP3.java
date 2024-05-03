public class MP3 extends Gadget {
    private int availableMemory; // in megabytes

    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void downloadMusic(int memorySize) {
        if (availableMemory >= memorySize) {
            availableMemory -= memorySize;
            System.out.println("Music downloaded successfully. Available memory: " + availableMemory + "MB");
        } else {
            System.out.println("Not enough memory to download the music. Please delete some files to free up space.");
        }
    }

    public void deleteMusic(int memorySize) {
        if (memorySize <= availableMemory) {
            availableMemory += memorySize;
            System.out.println("Music deleted successfully. Available memory: " + availableMemory + "MB");
        } else {
            System.out.println("Error: Memory to delete exceeds available memory.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Available Memory: " + availableMemory + "MB");
    }
}
