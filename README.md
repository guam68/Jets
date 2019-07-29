# Jets
### Week 3 Skill Distillery

## Overview
This week's project is continuing our practice on building classes while adding interfaces to the mix. We were to create an airfield and populate it with instances of different types of jets. Then, from within our main app, the user is presented with options to view and manipulate the aircraft in the airfield. The criteria for the project:

- The initial list of Jets must be loaded from a text file.
- When menu option 1 is pressed all Jets in the fleet are displayed to the user.
- When menu option 2 is selected, fly() is executed on all Jets.
- When menu option 3 is selected, the fastest jet from the list of Jets should be displayed to the user.
- When menu option 4 is selected, the jet with the longest range should be displayed to the user. Choosing type-specific behavior calls the interface method for those Jets.
- When the user chooses to add a Jet, you are prompted to enter the model, speed (in MPH), range, and price. This Jet should be added to the                    list of Jets so that when the user again selects menu option 1, that custom jet is included.
- When the user chooses to remove a Jet, the user is presented a menu for selecting the jet to remove.
- The final menu option should exit the program.


## Implementation
There are three classes that extend from an abstract class, Jet: FighterJet, CargoPlane, and JetImpl. JetImpl is just a vanilla jet while FighterJet and CargoPlane implement the interfaces CombatReady and CargoCarrier respectively. 

### Run Through

## Technologies Used
- Java
- Eclipse
- VSCode
