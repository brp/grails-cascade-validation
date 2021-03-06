package grails.cascade.validation

import com.cscinfo.platform.constraint.CascadeValidationConstraint
import grails.plugins.Plugin
import grails.validation.ConstrainedProperty

class GrailsCascadeValidationGrailsPlugin extends Plugin {

    def grailsVersion = "3.0.9 > *"
    def profiles = ['web']
    def title = "Cascade Validation Plugin"
    def author = "Russell Morrisey"
    def authorEmail = "rmorrise@cscinfo.com"
    def description = '''\
Establishes a 'cascade' constraint property for validateable objects. If "cascade:true" is set
 on a nested object, the nested object's validate() method will be invoked and the results will
 be reported as part of the parent object's validation.

Based on a blog post by Eric Kelm:
 http://asoftwareguy.com/2013/07/01/grails-cascade-validation-for-pogos/
Used with permission.
'''
    def documentation = "https://github.com/rmorrise/grails-cascade-validation/wiki/How-to-use-cascade-validation"
    def license = "APACHE"
    def organization = [name: "Corporation Service Company", url: "http://www.cscinfo.com/"]
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/rmorrise/grails-cascade-validation/issues']
    def scm = [url: 'https://github.com/rmorrise/grails-cascade-validation']

    def developers = [ [ name: "Soeren Glasius", email: "soeren@glasius.dk" ]]

    void doWithApplicationContext() { 
        ConstrainedProperty.registerNewConstraint(CascadeValidationConstraint.NAME, CascadeValidationConstraint)
    }

}
