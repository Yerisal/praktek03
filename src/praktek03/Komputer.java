package praktek03;

public class Komputer {
    private String merk;
    private String processor;
    private String memory;
    
    void cetakInfo(){
        System.out.println("Merk        \t: "+merk+"\n"+
                "Processor  \t: "+processor+"\n"+
                "Memory     \t: "+memory);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    
}
