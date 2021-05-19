println "< INFO >".center(50, "-")
println "Number:".padRight(20)      + "20"
println "Name:".padRight(20)        + "John Doe"
println "Address:".padRight(20)     + "34 Some Street, London"
println "Subscriber:".padRight(20)  + "YES"
println "Expired:".padRight(20)     + "NO"

println "\n╔" + "═" * 50 + "╗" + ("\n║" + "·" * 50 + "║")* 10 + "\n╚" + "═" * 50 + "╝"

/*  Output
---------------------< INFO >---------------------
Number:             20      
Name:               John Doe
Address:            34 Some Street, London
Subscriber:         YES
Expired:            NO

╔══════════════════════════════════════════════════╗
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
║··················································║
╚══════════════════════════════════════════════════╝
*/