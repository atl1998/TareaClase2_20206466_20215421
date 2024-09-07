package pe.edu.pucp.stw2.lab3.model.repository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pucp.stw2.lab3.model.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
