public class pp { 
    public static int waterM, ElectM;
    public static int resultBill;
    
    public static int currentWaterMeter, lastWaterMeter;
    public static int currentElectMeter, lastElectMeter;

    // Calculate water bill
    public static int calculateWaterBill() {
        if (currentWaterMeter >= lastWaterMeter) {
            waterM = (currentWaterMeter - lastWaterMeter) * 5;
        }
        return waterM;
    }

    // Calculate electric bill
    public static int calculateElectBill() {
        if (currentElectMeter >= lastElectMeter) {
            ElectM = (currentElectMeter - lastElectMeter) * 6;
        }
        return ElectM;
    }

    // Calculate total result bill based on room type
    public static int calculateResultBill(String roomType) {
        if (roomType.equals("S")) {  // S for Single Bed
            resultBill = 1500 + calculateElectBill() + calculateWaterBill();
        } else if (roomType.equals("D")) {  // D for Double Bed
            resultBill = 2000 + calculateElectBill() + calculateWaterBill();          
        }
        return resultBill;
    }

    public static void main(String[] args) {
        // Set example meter values
        currentElectMeter = 50;
        lastElectMeter = 20;

        currentWaterMeter = 100;
        lastWaterMeter = 50;
        
        // Call the calculateResultBill method with room type "D" (Double bed)
        System.out.println("Your bill is: " + calculateResultBill("D"));
    }
}