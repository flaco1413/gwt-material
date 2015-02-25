package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.GestureEndHandler;
import com.google.gwt.event.dom.client.GestureStartHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FocusListener;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.MouseWheelListener;

public class MaterialCheckBox extends CheckBox implements HasClickHandlers{

	private Object object;

	public MaterialCheckBox() {
		// TODO Auto-generated constructor stub
		this.getElement().getStyle().setMarginRight(20, Unit.PX);
	}

	public MaterialCheckBox(Element elem) {
		super(elem);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label, Direction dir) {
		super(label, dir);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label, DirectionEstimator directionEstimator) {
		super(label, directionEstimator);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, boolean asHTML) {
		super(label, asHTML);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, Direction dir) {
		super(label, dir);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, DirectionEstimator directionEstimator) {
		super(label, directionEstimator);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
	

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return addDomHandler(handler, ClickEvent.getType());
	}

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
	}

}
