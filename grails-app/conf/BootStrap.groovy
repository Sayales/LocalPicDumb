import groovy.sql.Sql
import localpicdumb.Folder
class BootStrap {

    def dataSource

    def init = { servletContext ->
       new Folder(name: 'random').save()
     
    }
    def destroy = {
    }
}
