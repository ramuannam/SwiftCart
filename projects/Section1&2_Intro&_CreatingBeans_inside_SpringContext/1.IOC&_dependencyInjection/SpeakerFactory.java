public class SpeakerFactory {

       //accepts speaker type that we want.
       //So based upon the speaker type, it will create the correspondent class object and it will return to the user. 

      // both speakers also has to implement speakers.
       //So based upon the speaker type that my developer passes to this method, a corresponding implementation object of speakers interface will be created.

       //So you can see here the speaker type is Sony. My speaker factory pattern will generate Sony speakers object Otherwise, if it is equal to Bose, it will create Bose speakers. If neither of the cases, then it will return a null object.  

    public Speakers getSpeakers(String speakerType){
        if(speakerType==null){
            return null;
        }
     
        if(speakerType.equalsIgnoreCase("SONY")){
            return new SonySpeakers();

        }else if(speakerType.equalsIgnoreCase("BOSE")){
            return new BoseSpeakers();
        }
        return null;
    }

    
}
