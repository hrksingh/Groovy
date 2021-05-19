// to execute windows cmds
//def process1 = "cmd /c dir".execute()
//println "${process1.text}"

// to execute windows wsl cmd
// proc1 = 'wsl ls -la'.execute()
// println proc1.text

//proc2 = 'powershell.exe /c start .'.execute()
//println ${proc2.text}

//def obj = ["question", 42, 'answer']
// println obj.getClass()

// def env = System.getenv().collect { k, v -> "$k = $v" }
// for (item in env) {
//    println item
// }

def process = "cmd /c dir".execute()
def out = new StringBuffer()
def err = new StringBuffer()
process.consumeProcessOutput( out, err )
if( out.size() > 0 ) println out
if( err.size() > 0 ) println err


def syslist =  System.properties.collect {k, v -> "[ $k = $v ]" }
syslist.each{ s -> println s}
println "\n ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n"
def prop =  System.properties.'java.library.path'.split(';')
prop.each { x -> println x }