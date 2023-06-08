# HC Room Management System

The Room Management System is a Java-based application that allows users to manage and book rooms in a facility. 
It provides an intuitive user interface and essential functionalities for efficiently managing room reservations and availability.

## Features

- **User Authentication**: User accounts are created by an admin/manager after which they can log in to the system to access the room reservation features.

- **Room Booking**: Users can check the availability of rooms and book them for specific dates and times.

- **Room Cancellation**: Managers can cancel their room bookings if needed, freeing up the room for other users.

- **User Roles**: The system supports different user roles, such as administrators, managers and regular users, with varying permissions and access levels.

- **Reporting**: The system generates reports on room occupancy, usage statistics, and other relevant data.

## Prerequisites

- Java Development Kit (JDK) 8 or later.
- APACHE database server (XAMPP) for data storage.

## Installation

1. Clone the repository or download the project ZIP file.
2. Import the project into your preferred Java IDE (e.g., NetBeans, Intellij).
3. Set up the MySQL database by importing the provided SQL file (`HC_LTD.sql`) found in the path /dist/database to create the required tables and schema.
4. Configure the database connection settings in the `services tab` on the left panel(in netbeans) and test the connection.
5. Clean & build the project and resolve any dependencies if necessary.(this creates a distributable folder containing a compiled jar file)
6. Copy the distributable folder to your desired location and create a shortcut for the jar file on the desktop.

## Usage

1. Double click the jar file to run the application.
2. In the login form put `user` as username `user` as password to login as user or `admin` as username and `123` as password to login as admin/manager
3. Explore the user interface to manage rooms, book reservations, and perform other actions as per your assigned role.

## Contributing

Contributions to the Room Management System project are welcome! If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request. Make sure to follow the established code style and provide detailed information about your changes.

## Acknowledgements

We would like to acknowledge the following resources and libraries that contributed to the development of this project:

- [Spring Boot](https://spring.io/projects/spring-boot) - Java framework for developing web applications.
- [Thymeleaf](https://www.thymeleaf.org/) - Server-side Java template engine.
- [MySQL](https://www.mysql.com/) - Open-source relational database management system.

## Contact

For any inquiries or support related to the Room Management System, please contact me at obuyacalvince672@gmail.com

Hope you find the Room Management System useful and efficient in managing your facility's rooms. 
Thank you for using our application!

Happy room management!

- Calvince Obuya