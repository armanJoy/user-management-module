package com.arcgen.usermgt.controllers.web.utility.mail;

import com.arcgen.usermgt.models.view.utility.MailVM;
import org.springframework.stereotype.Service;

public interface MailService {

    boolean sendMailToMailAddress(MailVM mailVM);

}
