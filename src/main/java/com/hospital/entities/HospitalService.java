package com.hospital.entities;

import java.util.List;


import com.hospital.DbConfig.HibernateDriver;
import com.hospital.models.Disease;
import com.hospital.models.Employee;
import com.hospital.models.EmployeeStatatistic;
import com.hospital.models.Message;
import com.hospital.models.NurseServiceTime;
import com.hospital.models.Room;
import com.hospital.models.SelledDrug;
import java.math.BigDecimal;
import java.math.BigInteger;

public class HospitalService extends HibernateDriver
        implements AdminDAO, UserDAO, ReceptioniestDAO, DoctorDAO, AccountantDAO, PharmatiestDAO, NurseDAO {

    
    private static final long serialVersionUID = 1L;

    private static final HospitalService HOSPITAL_SERVICE = new HospitalService();

    private HospitalService() {
    }

    public static HospitalService getInstance() {
        return HOSPITAL_SERVICE;
    }

    public List<Employee> getEmployees(String type) {
        List<Employee> employees = null;
        try {
            openSession();
           
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return employees;
    }

    public Employee getEmployee(String loginEmailOrName, String password) {
        Employee employee = null;
        try {
            openSession();
           
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return employee;
    }

    public <T extends Object> Object getObject(int employeeID, Class<T> clazz) {
        Object object = null;
        try {
            openSession();
           

        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return object;
    }

    public <T extends Object> int saveObject(T object) {
        int objectID = 0;
        try {
            openSession();

            System.out.println("Object Saved Successfuly...");

        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }

        return objectID;
    }

    public <T extends Object> void updateObject(T object) {
        try {
            openSession();
           } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
    }

   
    public <T extends Object> void deleteObject(T object) {
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
    }

    @Override
    public <T extends Object> List<T> getListObjects(Class<T> clazz) {
        List<T> objects = null;
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return objects;
    }

    public List<Employee> getListEmployeeWithout(int employeeID) {

        List<Employee> employees = null;
        try {
            openSession();

          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }

        return employees;
    }

    public void deleteAllMessageForEmployee(int employeeID) {
        try {
            openSession();
            String sql = "delete from Messages where from_employee_id= :empID or fto_employee_id= :empID";
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
    }

    public List<EmployeeStatatistic> getEmployeeStatistic() {
        List<EmployeeStatatistic> employeeStatatistics = null;
        try {
            openSession();
            String sql = "select type,count(employeeId) \"number\" From Employee GROUP By type";
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }

        return employeeStatatistics;
    }

    @Override
    public List<Message> getAllMessagesSentByEmployee(Integer employeeID) {
        List<Message> messages = null;
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return messages;
    }

    @Override
    public List<Message> getAllMessagesForEmployee(Integer employeeID) {
        List<Message> messages = null;
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return messages;
    }
    
    @Override
    public List<Message> getAllUnreadMessagesForEmployee(Integer employeeID) {
        List<Message> messages = null;
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return messages;
    }

    @Override
    public void deleteAllPatientMessages(int patientID) {
        try {
            openSession();
            String sql = "delete from Messages where patient_id = :patID";
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
    }

    @Override
    public void deleteAllRoomBooked(int roomID) {
        try {
            openSession();
            String sql = "delete from BookBeds where room_id = :roomID";
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
    }

    @Override
    public List<Disease> getAllDiseaseByEmployeeID(int employeeID) {
        List<Disease> diseases = null;
        try {
            openSession();
          
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return diseases;
    }

    public void composeMessage(Message message) {
        try {
            openSession();
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }

    }

    public int getMaxIDObject() {
        BigDecimal maxID = new BigDecimal(0);
        try {
            openSession();
            String sql = "Select max(selledDrugID) from SelledDrugs";
            
            if(maxID==null)
                maxID=new BigDecimal(BigInteger.ZERO);
            
        } catch (Exception ex) {
            maxID=BigDecimal.ZERO;
        } finally {
            closeSession();
        }
      
       return maxID.intValue();
    }

    @Override
    public void sellDrug(SelledDrug selledDrug) {
        try {
            openSession();
            String sql = "insert into SelledDrugs ( SELLEDDRUGID ,Drug_ID, patient_ID, pharmatiest_ID, quantity, selledDate,unitPerDay,startDate,endDate) values(:1,:2,:3,:4,:5,:6,:7,:8,:9)";
        
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }

    }

    @Override
    public List<Room> getAllAvailableRoom() {
        List<Room> rooms = null;
        try {
            openSession();

        
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return rooms;
    }

    public List<SelledDrug> getAllSelledDrugForPatient(int patientID) {
        List<SelledDrug> selledDrugs = null;
        try {
            openSession();
        
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return selledDrugs;
    }

    @Override
    public List<NurseServiceTime> getAllServiceTime(int nurseID) {
        List<NurseServiceTime> nurseServiceTimes = null;
        try {
            openSession();
        
        } catch (Exception ex) {
            roleBack();
            ex.printStackTrace();
        } finally {
            closeSession();
        }
        return nurseServiceTimes;

    }

}
