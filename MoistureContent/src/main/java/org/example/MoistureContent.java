package org.example;

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
    public MoistureContent(float Mc, float Mcms, float Mcds){
        this.tareMass=Mc;
        this.tareMaterialWetMass = Mcms;
        this.tareMaterialDryMass = Mcds;
    }

    // Calculate the material wet mass
    public float materialWetMass(){
        return (tareMaterialWetMass-tareMass);
    }

    //Calculate the material dry mass

    public float materialDryMass(){
        return (tareMaterialDryMass-tareMass);
    }
    // Calculate the water content
    public float waterContent(){
        float w = (tareMaterialWetMass-tareMaterialDryMass)*100/(tareMaterialDryMass - tareMass);
        //rounding the result
        return Math.round(w);
    }

}
