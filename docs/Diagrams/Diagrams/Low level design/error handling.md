# Error Handling in Your System

Error handling ensures that your application can detect, report, and recover from unexpected situations without crashing. In your system (bus ticketing), common errors may include:

## A. User/Passenger Errors

- Invalid login credentials.
- Registration with incomplete or invalid information (e.g., missing email or phone number).
- Attempting to make a booking without sufficient balance.
- Trying to change a password with wrong current password.

**Implementation:**
- Use try-catch blocks (in Java) or equivalent constructs to capture exceptions.
- Return meaningful error messages to the user.

**Example:**
```java
try {
    passenger.login(username, password);
} catch(InvalidCredentialException e) {
    System.out.println("Error: Invalid username or password.");
}
```

## B. Booking Errors

- Booking a seat that is already reserved.
- Invalid route or ticket selection.
- Payment failure (insufficient balance or invalid payment method).

**Implementation:**
- Check seat availability before confirming booking.
- Verify payment status before marking booking as complete.

**Example:**
```java
if(!seat.isAvailable()) {
    throw new SeatNotAvailableException("Seat is already reserved.");
}
```

## C. System Errors

- Database connection failure.
- Unexpected null values or invalid object references.
- File read/write errors for logs or configuration.

**Implementation:**
- Use logging frameworks (e.g., Log4j in Java) to log errors.
- Gracefully terminate processes if critical errors occur.
