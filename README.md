# SOLID PRINCIPLES ASSIGNMENT

## SINGLE RESPONSIBILITY PRINCIPLE

- Profile class: The primary responsibility of Profile class is to represent a user profile, and it manages the profile-related data and methods. So it adheres to the SRP principle.
- CreateProfileService Class: This class is responsible for creating different types of profiles based on user input. It takes user input, creates profiles, and ensures that each profile type is created correctly.
- ProfileAuthenticationManager Class: Manages the authentication process for user profiles. It validates login credentials and logs out profiles. It follows SRP by focusing on authentication-related tasks.
- ProfileContentManager Class: Manages the addition of content to a profile's watchlist and watch history. It adheres to SRP by concentrating on content management tasks.


## OPEN/CLOSED PRINCIPLE

- Profile Class: The Profile class is open for extension and closed for modification, as evident by its abstract nature and the presence of subclasses (KidsProfile, AdultProfile, ElderProfile). New profile types can be added without modifying the existing Profile class.
- Interfaces (AuthenticationManager and ContentManager): These interfaces are open for extension and closed for modification, allowing new classes to implement them and provide additional functionalities without changing the interfaces themselves.
- ProfileService Class: The ProfileService class is designed to be open for extension and closed for modification. New methods or features can be added to enhance its functionality without altering the existing code significantly.


## LISKOV SUBSTITUTION PRINCIPLE

- Subclasses like KidsProfile, AdultProfile, and ElderProfile can be used interchangeably with their base class Profile.
- We create an instance of the KidsProfile class and we can assign it to a variable of type Profile (the base class).
- This substitution is permissible because KidsProfile is a subtype of Profile, and we can use it wherever a Profile is expected.
- Instances of subclasses (KidsProfile, AdultProfile, ElderProfile) can be substituted wherever an instance of the base class (Profile) is expected.


## INTERFACE SEGGREGATION PRINCIPLE

- The AuthenticationManager interface defines two methods: profileLogin and profileLogout.
- This interface is relatively small and specific, focusing on methods related to profile authentication.
- The ProfileAuthenticationManager class implements the AuthenticationManager interface.
- It provides specific implementations for both profileLogin and profileLogout methods.
- The ContentManager interface defines two methods: addToWatchlist and addToWatchHistory.
- This interface is small and specific, providing methods related to managing content for a profile.
- The ProfileContentManager class implements the ContentManager interface.
- It provides specific implementations for both addToWatchlist and addToWatchHistory methods.
- So this follows ISP.


## DEPENDENCY INVERSION PRINCIPLE

- The AuthenticationManager and ContentManager interfaces serve as abstractions.
- The concrete classes ProfileAuthenticationManager and ProfileContentManager provide specific implementations for the methods defined in the respective interfaces.
- This allows ProfileService to interact with these implementations without needing to know the specific details of how authentication or content management is performed.
- The ProfileService class represents a high-level module that depends on abstractions rather than concrete implementations
