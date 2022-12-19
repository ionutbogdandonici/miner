package it.unicam.cs.thesis.domain;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * On the top level there is one <bold>log</bold> object, which contains all
 * event information that is related to one specific process. Examples for processes are:
 * <ul>
 *     <li>Handling insurance claims</li>
 *     <li>Using a complex x-ray machine</li>
 *     <li>Browsing a website</li>
 * </ul>
 *
 * A log contains an arbitrary number (may be empty) of <code>XTrace</code> objects.
 *
 * @author Bogdan Donici
 */
@Component
@Scope("singleton")
@Data
public class XLog {

    private double version;
    private String features;

    private List<XTrace> traces;
}
