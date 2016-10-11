class Api::GraphsController < Api::BaseController

  def create
    @graph = Graph.new(graph_params)

    if @graph.save
      respond_with @graph
    else
      render status: :internal_server_error
    end
  end

  def show
    respond_with @graph = Graph.find(params[:id])
  end

  protected
  def graph_params
    params.require(:graph).permit(:json_string)
  end
end
