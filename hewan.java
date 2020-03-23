package Hewan;

/**
 *
 * @author fakhrul
 */
public class Hewan {
    String id;
    String pemilik;
    boolean statusPenitipan;
    
    void info(String id, String pemilik){
        this.id = id;
        this.pemilik = pemilik;
        System.out.println("Info Hewan : \n"+"ID : "+id+"\n"+"Pemilik : "+pemilik);
    }
    
    boolean status(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
        System.out.println("");
        System.out.println("Status Hewan : ");
        return true;       
    }
    
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        anjing anjing = new anjing(true);
        ikan ikan = new ikan(false);
        
        hewan.info("18090113", "Fakhrul Anam");
        hewan.status(true);
        System.out.println("Status Suntik Rabies : "+anjing.statusSuntikRabies);
        System.out.println("Status Ganti Air : "+ikan.statusGantiAir);
    }    
}

