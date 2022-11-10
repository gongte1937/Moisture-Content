// create an object model with several filed
public class MoistureContent {

    // measurement field
     private String tareID;
     private float  tareMass;
     private float tareMaterialWetMass;

    // Dry Mass field
    private float dryMassBalance;
    private float tareMaterialDryMass;


    //the constructor
    public MoistureContent(float Mcms, float Mc, float Mcds){
        this.tareMass=Mc;
        this.tareMaterialWetMass = Mcms;
        this.tareMaterialDryMass = Mcds;
    }

    // Calculate the material wet mass
    public float materialWetMas(){
        return (tareMaterialWetMass-tareMass);
    }

    //Calculate the material dry mass

    public float materialDryMas(){
        return (tareMaterialDryMass-tareMass);
    }
    // Calculate the water content
    public float waterContent(){
        float w = (tareMaterialWetMass-tareMaterialDryMass)*100/(tareMaterialDryMass - tareMass);
        //rounding the result
        return Math.round(w);
    }

}
