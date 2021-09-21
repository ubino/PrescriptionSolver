package eu.dedalus.prescriptionsolver;

import eu.dedalus.prescriptionsolver.Prescription;
import eu.dedalus.prescriptionsolver.PrescriptionEntity;
import eu.dedalus.prescriptionmodel.Drug;
import eu.dedalus.prescriptionmodel.CommonDataInterface;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class PrescriptionDrug extends PrescriptionEntity implements java.io.Serializable {

	static final long serialVersionUID = 1L;


	private Drug drug;

	public PrescriptionDrug() {
	    super(null);
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public PrescriptionDrug(Prescription prescription, Drug drug) {
		super(prescription);
		this.drug = drug;
	}
	
	@Override
	protected CommonDataInterface getConnonData() {
	    return this.drug;
	}

}