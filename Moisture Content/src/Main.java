import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MassNotValidException {

    // input the data
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the tare mass: ");
        float Mc = input.nextInt();
        System.out.print("Enter the tare and material wet Mass: ");
        float Mcms = input.nextInt();
        System.out.print("Enter the tare and material dry Mass: ");
        float Mcds = input.nextInt();

        //close the input
        input.close();
/Users/liweihengtegong/Documents/work/Code test/moister measurement/Moisture Content/src/MoistureContent.java

//    // validate the number
//        validateInput(Mc,Mcms,Mcds);

    // create a new object and calculate
        MoistureContent a = new MoistureContent(Mcms,Mc, Mcds);
        System.out.print("结果为");
        System.out.println(a.materialWetMas());
        System.out.println(a.materialDryMas());
        System.out.println(a.waterContent() + "%");
    }

    // validate the data
//    private static void validateInput(float Mc,float Mcms, float Mcds) throws MassNotValidException {
//        if (Mc == 0){
//            throw new MassNotValidException();
//        }
//    }
}