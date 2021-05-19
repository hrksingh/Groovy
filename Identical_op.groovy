import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Creature { String type }

def cat = new Creature(type: 'cat')
def copyCat = cat
def lion = new Creature(type: 'cat')

println cat.equals(lion) // Java logical equality
println cat == lion      // Groovy shorthand operator

println cat.is(copyCat)  // Groovy identity
println cat === copyCat  // identical operator shorthand
println cat !== lion     // negated operator shorthand

// cat and lion are two diff object as they created with new keyword so they are equal because value is same but 
// not identical as there equal and hascode is diff and they are store in diff location in memory