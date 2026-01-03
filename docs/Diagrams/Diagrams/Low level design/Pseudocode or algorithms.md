 PSEUDOCODE&ALGORITHM
USER CLASS
 Algorithm: User Management
Start


Accept user action (login / update / logout)


If action is login, validate credentials


If action is update, modify profile details


If action is logout, end session


Return status


End
pseudocode
BEGIN
  DECLARE userID          : INTEGER
  DECLARE name            : STRING
  DECLARE email           : STRING
  DECLARE phone           : STRING
  DECLARE password        : STRING
  DECLARE action          : STRING
  DECLARE status          : BOOLEAN

  INPUT action

  IF action = "LOGIN" THEN
       INPUT email, password
       status ← validateUser(email, password)

  ELSE IF action = "UPDATE" THEN
       INPUT name, phone
       UPDATE UserTable SET name, phone WHERE userID = currentUserID
       status ← TRUE

  ELSE IF action = "LOGOUT" THEN
       status ← TRUE
  ENDIF

  RETURN status
END

PASSENGER CLASS
🔹 Algorithm: Passenger Operations
Start


Register or login passenger


Select route and seat


Create booking


Proceed to payment


End
pseudocode
BEGIN
  DECLARE passengerID        : INTEGER
  DECLARE routeID            : INTEGER
  DECLARE seatID             : INTEGER
  DECLARE amount             : DOUBLE
  DECLARE bookingStatus      : STRING

  INPUT routeID, seatID

  IF checkSeatAvailability(seatID) = TRUE THEN
       bookingStatus ← "CREATED"
       amount ← getSeatPrice(seatID)
  ELSE
       bookingStatus ← "FAILED"
  ENDIF

  RETURN bookingStatus
END
ADMIN CLASS
🔹 Algorithm: Admin Control
Start


Select management option


Perform selected operation


Save changes


End


🔹 Pseudocode
BEGIN
  DECLARE adminID : INTEGER
  DECLARE choice  : INTEGER

  DISPLAY "1-Users  2-Buses  3-Routes"
  INPUT choice

  SWITCH(choice)
    CASE 1: manageUsers()
    CASE 2: manageBuses()
    CASE 3: manageRoutes()
  ENDSWITCH
END


4️⃣ BUS CLASS
🔹 Algorithm: Bus Management
Start


Add or update bus details


Validate capacity


Store bus information


End


🔹 Pseudocode
BEGIN
  DECLARE busID        : INTEGER
  DECLARE plateNumber  : STRING
  DECLARE capacity     : INTEGER
  DECLARE busType      : STRING
  DECLARE status       : STRING

  INPUT plateNumber, capacity, busType

  IF capacity > 0 THEN
       status ← "ACTIVE"
       SAVE bus details
  ENDIF
END


5️⃣ SEAT CLASS
🔹 Algorithm: Seat Allocation
Start


Check seat availability


Reserve or release seat


Update seat status


End


🔹 Pseudocode
BEGIN
  DECLARE seatID        : INTEGER
  DECLARE isAvailable   : BOOLEAN

  IF isAvailable = TRUE THEN
       isAvailable ← FALSE
  ELSE
       DISPLAY "Seat not available"
  ENDIF
END


6️⃣ ROUTE CLASS
🔹 Algorithm: Route Processing
Start


Create or update route


Calculate fare


Save route details


End


🔹 Pseudocode
BEGIN
  DECLARE routeID      : INTEGER
  DECLARE source       : STRING
  DECLARE destination  : STRING
  DECLARE fare         : DOUBLE

  INPUT source, destination, fare
  SAVE route details
END


7️⃣ BOOKING CLASS
🔹 Algorithm: Booking Handling
Start


Create booking


Confirm booking after payment


Update booking status


End


🔹 Pseudocode
BEGIN
  DECLARE bookingID     : INTEGER
  DECLARE seatID        : INTEGER
  DECLARE status        : STRING

  IF paymentSuccess = TRUE THEN
       status ← "CONFIRMED"
  ELSE
       status ← "CANCELLED"
  ENDIF
END


8️⃣ PAYMENT CLASS
🔹 Algorithm: Payment Processing
Start


Verify payment method


Process transaction


Update payment status


End


🔹 Pseudocode
BEGIN
  DECLARE paymentID     : INTEGER
  DECLARE amount        : DOUBLE
  DECLARE paymentStatus : STRING

  IF amount > 0 THEN
       paymentStatus ← "SUCCESS"
  ELSE
       paymentStatus ← "FAILED"
  ENDIF
END


9️⃣ TICKET CLASS
🔹 Algorithm: Ticket Generation
Start


Generate ticket details


Validate ticket


Issue ticket


End


🔹 Pseudocode
BEGIN
  DECLARE ticketID       : INTEGER
  DECLARE ticketNumber   : STRING
  DECLARE isValidated    : BOOLEAN

  ticketNumber ← GENERATE()
  isValidated ← FALSE
END


🔟 AI CHATBOT CLASS
🔹 Algorithm: Chatbot Assistance
Start


Receive user query


Analyze query


Respond to user


End


🔹 Pseudocode


BEGIN
  DECLARE query     : STRING
  DECLARE response  : STRING

  INPUT query
  response ← processQuery(query)
  RETURN response
END



