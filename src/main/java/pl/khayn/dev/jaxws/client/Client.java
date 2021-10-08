package pl.khayn.dev.jaxws.client;

import lombok.extern.java.Log;
import pl.khayn.dev.jaxws.server.Employee;
import pl.khayn.dev.jaxws.server.EmployeeServiceImpl;
import pl.khayn.dev.jaxws.server.EmployeeServiceImplService;

@Log
public class Client {

    public static void main(String[] args) {

        EmployeeServiceImpl webService = new EmployeeServiceImplService().getEmployeeServiceImplPort();
        var employeeById = webService.getEmployeeById("1");

        log.info("Got Employee from service: [" + employeeById.getId() + ", "+ employeeById.getName() + "]");
    }
}
