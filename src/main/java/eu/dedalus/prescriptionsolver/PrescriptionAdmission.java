package eu.dedalus.prescriptionsolver;

import eu.dedalus.prescriptionsolver.Prescription;
import eu.dedalus.prescriptionsolver.PrescriptionEntity;
import eu.dedalus.prescriptionmodel.CommonDataInterface;
import eu.dedalus.prescriptionmodel.Admission;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class PrescriptionAdmission extends PrescriptionEntity implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private Admission admission;
    
    public PrescriptionAdmission() {
	    super(null);
	}
	
	public PrescriptionAdmission(Admission admission, Prescription prescription) {
		super(prescription);
		this.admission = admission;
	}

	public Admission getAdmission() {
		return this.admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	
	@Override
	protected CommonDataInterface getConnonData() {
	    return this.admission;
	}


}