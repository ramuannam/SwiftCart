public class TyreFactory {
    //same like speakerfactory 

    public Tyres getTyre(String tyreType){
        if(tyreType==null){
            return null;
        }

        if(tyreType.equalsIgnoreCase("MRF")){
            return new MRFTyres();
        }else if(tyreType.equalsIgnoreCase("BRIDGESTONE")){
            return new BridgeStoneTyres();
        }
        return null;
    }
    
}
