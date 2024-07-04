

//you are a vehicle manufacturer,so whenever you want to manufacture a vehicle there are many parts for the vehicle like engine, tyres,seats, music system, dashboard etc.. so as a manufacturer you do't want to manufacture all of them but to outsource few of them from others who are good at making them.


public class vehicle {
    //creating own dependencies by creating object of the required component.

    //this is the approach developers follow before invention of DI and IOC. where programmers control the flow of program.

    //but in future when i want to change the outsource manufacturer from one company to another then i need to change this all code below.

    //Think of a scenario whenever business want to change something every time you can't go and change your code.

// So with this approach, which we used to have before the invention of inversion of control and dependency injection, all your components are tightly coupled with each other.

// Like my vehicle manufacturing is tightly coupled with Sony speakers and Michelin tyres, and whenever I want to change that dependency, definitely all my core logic will be disturbed, which means I have to do testing again.  I have to consider a lot of regression efforts.

 
    public void makeVehicle(){
         SonySpeakers sonySpeakers = newSonySpeakers();
         System.out.println(sonySpeakers.makeSound());
         MrfTyres mrfTyres = new MrfTyres();
         System.out.println(mrfTyres.rotate());

    }

    
// So that's why a new paradigm called Inversion of Control is introduced to achieve loose coupling between the components of an application.

// So when this inversion of control and dependency injection is introduced, many of the developers, they try to adopt certain design patterns like factory pattern that we have inside Java to reduce that tight coupling between the components.

// Like you can see, the second method that we have is make vehicle 2 method.

// So here how it works is first we will prepare a factory pattern class both for speakers and tyres.

public void makeVehicle2(){
    SpeakerFactory speakerFactory=new SpeakerFactory();
    Speakers speakers=speakerFactory.getSpeakers("SONY");
    System.out.println(speakers.makeSound());

    TyreFactory tyreFactory=new TyreFactory();
    Tyres tyres=tyreFactory.getTyre("MRF");
    System.err.println(tyres.rotate());
}
}



