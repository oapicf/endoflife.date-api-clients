#tag Class
Protected Class Cycle

	#tag Property, Flags = &h0
		cycle As OpenAPIClient.Models.CycleCycle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Release date for the first release in this cycle.
		#tag EndNote
		releaseDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		eol As OpenAPIClient.Models.CycleEol
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Latest release in this cycle.
		#tag EndNote
		latest As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Link to changelog for the latest release in this cycle, or null if unavailable.
		#tag EndNote
		link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		lts As OpenAPIClient.Models.CycleLts
	#tag EndProperty


	#tag Property, Flags = &h0
		support As OpenAPIClient.Models.CycleSupport
	#tag EndProperty


	#tag Property, Flags = &h0
		discontinued As OpenAPIClient.Models.CycleDiscontinued
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cycle"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CycleCycle"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="releaseDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eol"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CycleEol"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="latest"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CycleLts"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="support"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CycleSupport"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="discontinued"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CycleDiscontinued"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


