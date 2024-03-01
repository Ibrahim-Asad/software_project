package software_project.DataBase.insert;

import software_project.EventManagement.EventService;
import software_project.UserManagement.User;
import software_project.helper.Generator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class insertData {
    private String status;
    private Connection conn;

    public insertData(Connection conn) {
        this.conn = conn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean insertUser(User user) {

        try {
            conn.setAutoCommit(false);
            String query = "insert into users values (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt = Generator.userToPS(preparedStmt, user);
            preparedStmt.execute();
            setStatus("User was inserted successfully");
            conn.commit();
            return true;
        } catch (Exception e) {
            setStatus("Couldn't insert user");

            return false;
        }

    }

    public boolean insertEventService(EventService es) {

        try {
            conn.setAutoCommit(false);
            String query = "insert into Event_Service values (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt = Generator.eventStatementToPS(preparedStmt, es);
            preparedStmt.execute();
            setStatus("Event added successfully");
            conn.commit();
            return true;
        } catch (Exception e) {
            setStatus("Couldn't insert user");

            return false;
        }

    }

    }

