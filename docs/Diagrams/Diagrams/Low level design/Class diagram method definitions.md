Class diagram method definitions
Class : user
1. login(email, password) : boolean
Defination
Validate email and password format
Fetch user record from database
Compare encrypted password
Return true if matched, else false
2. logout() : void
Defination
Destroy user session
Clear authentication token
3. updateProfile(name, phone) : void
Defination
Validate input fields
Update user profile details in database
4. changePassword(oldPass, newPass) : boolean
Defination
Verify old password
Validate new password strength
Update encrypted password
Return success status
5. viewProfile() : User
Defination
Fetch and return user profile details
Class: Passenger (extends User)
1. register() : boolean
Defination
Validate passenger data
Check duplicate email
Save passenger record
Return registration status
2. startBooking(routeId) : Booking
Defination
Validate route availability
Create new booking record
Return Booking object
3. makePayment(amount) : Payment
Defination
Check wallet balance or payment method
Initiate payment process
Return Payment object
4. viewBookingHistory() : List<Booking>
Defination
Fetch all bookings linked to passenger
Return booking list
Class: Admin (extends User)
1. manageUsers() : void
Defination
View, activate, deactivate users
2. manageBuses() : void
Defination
Add, update, remove bus details
3. manageRoutes() : void
Defination
Create, update, delete routes
4. generateReport() : Report
Defination
Collect booking, payment, and user data
Generate system report
Class: Bus
1. addBus() : void
Defination
Validate bus details
Save bus record to database
2. updateBus() : void
Defination
Modify existing bus details
3. removeBus() : void
Defination
Mark bus as inactive or delete record
4. getBusInfo() : Bus
Defination
Fetch and return bus details
Class: Seat
1. reserveSeat() : boolean
Defination
Check availability
Mark seat as reserved
Return reservation status
2. releaseSeat() : void
Defination
Mark seat as available again
3. checkAvailability() : boolean
Defination
Return seat availability status
4. getSeatInfo() : Seat
Defination
Fetch seat details
Class: Route
1. createRoute() : void
Defination
Validate source and destination
Save route data
2. updateRoute() : void
Defination
Modify route details
3. deleteRoute() : void
Defination
Remove route from system
4. getRouteInfo() : Route
Defination
Fetch route details
Class: Booking
1. createBooking(passengerId) : void
Defination
Assign passenger
Calculate total amount
Save booking record
2. confirmBooking() : void
Defination
Verify payment
Update booking status to CONFIRMED
3. cancelBooking() : void
Defination
Release seats
Update status to CANCELLED
4. getBookingDetails() : Booking
Defination
Fetch booking information
Class: Payment
1. processPayment() : boolean
Defination
Initiate transaction
Update payment status
2. verifyPayment() : boolean
Defination
Confirm payment from gateway
Return verification result
3. refundPayment() : void
Defination
Initiate refund
Update payment status
4. getPaymentDetails() : Payment
Defination
Fetch payment record
Class: Ticket
1. generateTicket(bookingId) : void
Defination
Generate ticket number and QR code
Link ticket to booking
2. validateTicket() : boolean
Defination
Verify QR code
Mark ticket as validated
3. getTicketDetails() : Ticket
Defination
Fetch ticket information
Class: AIChatbot
1. respondToQuery(message) : String
Defination
Analyze user query
Return appropriate response
2. provideHelp() : String
Defination
Return help instructions
3. suggestRoutes(source, destination) : List<Route>
Defination
Search routes
Return matching route list
4. endChat() : void
Defination
Close chatbot session


