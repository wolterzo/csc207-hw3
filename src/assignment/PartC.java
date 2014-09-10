package assignment;

public class PartC
{
  /*
   * class Coords
   * FIELDS:
   * 
   * double latitude
   * double longitude
   */
  /*
   * class TimeStamp
   * int year
   * int month
   * int day
   * int hour
   * int minute
   * double second
   */
  /*
   * class Incident 
   * FIELDS:
   * 
   * String incidentName
   * String ownerName
   * String locationName
   * String description
   * Coords coords
   * String[] tags
   * TimeStamp time 
   * 
   */
  /*
   * OBSERVERS
   * Method:      getOwnerName
     Type:        Observer
     Purpose:     Get the name of the owner of this resource.
     Parameters:  [none]
     Produces:    name, a String
     
   * Method:      getIncidentName
     Type:        Observer
     Purpose:     Get the name incident reported.
     Parameters:  [none]
     Produces:    name, a String
     
   * Method:      getIncidentLocationName
     Type:        Observer
     Purpose:     Get the name of the location of the incident
                  reported.
     Parameters:  [none]
     Produces:    name, a String
     
   * Method:      getIncidentLocationCoordinates
     Type:        Observer
     Purpose:     Get the coordinates of the location of the incident
                  reported.
     Parameters:  [none]
     Produces:    coords, Coords
        
   * Method:      getIncidentDescription
     Type:        Observer
     Purpose:     Get the description of the incident reported.
     Parameters:  [none]
     Produces:    name, a String
     
   * Method:      getIncidentTags
     Type:        Observer
     Purpose:     Get the tags of the incident reported.
     Parameters:  [none]
     Produces:    tags, an array of strings
   
   * MUTATORS
   * Method:      addTag
     Type:        Mutator
     Purpose:     Add a tag to an existing incident
     Parameters:  tag, a string
     Produces:    [none]
     
   * Method:      updateDescription
     Type:        Mutator
     Purpose:     Change the description of the incident.
     Parameters:  text, a string
     Produces:    [none]
     
   * CONSTRUCTORS
   * Method:      createIncident
     Type:        Constructor
     Purpose:     Create incident object.
     Parameters:  title, String,
                  description, String,
                  locationName, String, 
                  coords, Coords,
                  ownerName, String,
                  tags, String[],
                  time, TimeStamp
     Produces:    Incident
     
   * Method:      createCoords
     Type:        Constructor
     Purpose:     Create coordinate object.
     Parameters:  latitude, double,
                  longitude, double
     Produces:    Coords
     
   * Method:      createTimeStamp
     Type:        Constructor
     Purpose:     Create coordinate object.
     Parameters:  year, int,
                  month, int,
                  day, int,
                  hour, int,
                  minute, int,
                  second, double
     Produces:    TimeStamp
     
   */
}
