package btm.training.springboot.shoponline.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import btm.training.springboot.shoponline.entity.Account;

@Repository
@Transactional
public class AccountDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }

}
