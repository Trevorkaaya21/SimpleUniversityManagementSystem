# Simple University Management System

A Java Swing-based desktop application for managing university users, courses, and registrations.

## Features

- **User Login**: Supports login for Students and Professors.
- **User Registration**: New users can register with ID, name, password, and role.
- **Password Reset**: Users can reset their password if forgotten.
- **Profile View**: View user profile information.
- **Student Management**: Professors can add, update, and delete student records.
- **Course Registration**: Students can register and withdraw from courses.
- **GPA Calculation**: Students can view their GPA based on registered courses.
- **Persistent Storage**: User data is saved to disk (`users.dat`).

## Technologies

- Java 8+
- Swing GUI
- Serializable data storage

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/SimpleUniversityManagementSystem.git
    ```
2. Open the project in your preferred Java IDE (NetBeans recommended for `.form` files).
3. Build and run the project.

## Usage

- **Login**: Start the application and log in as Student or Professor.
- **Register**: Use the Register button to create a new user.
- **Forgot Password**: Reset your password using the Forgot Password button.
- **Student Management**: Professors can manage students via the UMS window.
- **Course Registration**: Students can register/withdraw courses and view GPA.

## File Structure

- `src/` - Java source files
- `users.dat` - Serialized user data (created at runtime)
- `.form` files - NetBeans GUI designer forms

## Contributing

Pull requests are welcome. For major changes, please open an issue first.

## License

MIT License
