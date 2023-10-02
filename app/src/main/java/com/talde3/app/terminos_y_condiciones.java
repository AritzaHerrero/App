package com.talde3.app;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class terminos_y_condiciones extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos_y_condiciones);

        TextView TerminosYCondiciones;
        TerminosYCondiciones = (TextView)findViewById(R.id.txtTerminos);
        TerminosYCondiciones.setText(Html.fromHtml("<b>1. Aceptación de los Términos y Condiciones</b> <br></br>" +

                "        <b>1.1. Al utilizar la aplicación móvil \"Dream Evenement\" (\"la Aplicación\"), aceptas y te comprometes a cumplir estos Términos y Condiciones de Uso. Si no estás de acuerdo con estos términos, por favor, no utilices la Aplicación.</b> <br></br><br></br>" +
                "        <b>2. Registro y Cuentas de Usuario</b> <br></br>" +
                "        <b>2.1. Registro:</b> Para utilizar ciertas características de la Aplicación, es necesario que te registres y crees una cuenta de usuario. Debes proporcionar información precisa, completa y actualizada durante el proceso de registro.<br></br>" +
                "        <b>2.2. Información de Inicio de Sesión:</b> Eres responsable de mantener la confidencialidad de tu información de inicio de sesión (nombre de usuario y contraseña) y de todas las actividades que ocurran bajo tu cuenta de usuario. Si sospechas que tu cuenta ha sido comprometida, debes notificarnos de inmediato. <br></br>" +
                "        <b>2.3. Menores de Edad:</b> La Aplicación está destinada a usuarios mayores de 18 años. Si eres menor de edad, necesitas el consentimiento de un padre o tutor legal para utilizar la Aplicación. <br></br> <br></br>" +
                "        <b>3. Reservas de Eventos</b>" +
                "        <b>3.1. Reservas:</b> La Aplicación permite a los usuarios realizar reservas para eventos. La disponibilidad de eventos y los términos de reserva pueden variar y estar sujetos a cambios sin previo aviso. <br></br>" +
                "        <b>3.2. Políticas de Eventos:</b> Al realizar una reserva a través de la Aplicación, aceptas las políticas y términos específicos de cada evento, incluyendo, pero sin limitarse a, plazos de cancelación, tarifas aplicables, políticas de reembolso y restricciones. <br></br>" +
                "        <b>3.3. Pagos:</b> Los pagos realizados a través de la Aplicación se procesarán de acuerdo con las políticas de pago establecidas por el organizador del evento. Dream Evenement no es responsable de problemas relacionados con pagos o transacciones financieras. <br></br> <br></br>" +
                "        <b>4. Uso Adecuado de la Aplicación</b>" +
                "        <b>4.1. Conducta del Usuario:</b> Aceptas utilizar la Aplicación de manera responsable y respetuosa. No debes utilizar la Aplicación para actividades ilegales o fraudulentas ni para infringir los derechos de terceros. <br></br>"  +
                "        <b>4.2. Contenido Generado por el Usuario:</b> Si proporcionas contenido (comentarios, reseñas, imágenes, etc.) a través de la Aplicación, garantizas que tienes los derechos necesarios para compartir dicho contenido y otorgas a Dream Evenement una licencia no exclusiva para utilizar, modificar y mostrar dicho contenido en relación con la Aplicación.<br></br> <br></br>" +
                "        <b>5. Modificaciones y Terminación</b>" +
                "        <b>5.1. Modificaciones:</b> Dream Evenement se reserva el derecho de modificar estos Términos y Condiciones en cualquier momento. Te notificaremos de cualquier cambio mediante una notificación en la Aplicación o por correo electrónico. El uso continuado de la Aplicación después de la notificación de cambios constituirá tu aceptación de los términos modificados. <br></br>" +
                "        <b>5.2. Terminación:</b> Dream Evenement se reserva el derecho de suspender o terminar tu cuenta y tu acceso a la Aplicación en caso de incumplimiento de estos Términos y Condiciones. <br></br><br></br>" +
                "        <b>6. Privacidad</b> <br></br>" +
                "        <b>6.1. Privacidad:</b> Tu privacidad es importante para nosotros. Consulta nuestra Política de Privacidad para obtener información sobre cómo recopilamos, utilizamos y protegemos tus datos personales. <br></br> <br></br>" +
                "        <b>7. Limitación de Responsabilidad</b> <br></br>" +
                "        <b>7.1. Exención de Responsabilidad:</b> Dream Evenement no se hace responsable de los eventos o servicios ofrecidos a través de la Aplicación, ni de los problemas que puedan surgir en relación con los mismos. La Aplicación se proporciona tal cual y según disponibilidad."));
    }
}