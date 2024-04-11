# Thread States

### 1) New 
###     start()
### 2) Runnable     -------------------
###     run()            |            |
### 3) Running           | notify()   |
###     sleep()          |            |
###     wait()           |            | stop()
### 4) Waiting      ------            |
###     stop()                        |
### 5) Dead         -------------------